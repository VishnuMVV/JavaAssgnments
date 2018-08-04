/*
 * Program to split the query string into words and extract certain parts of querystring
 */
package com.stackroute.assignments;

import java.util.Scanner;

public class Assignment1 {
	/*
	 * Main method used for calling the various string methods from DataMunger class
	 */

	/*
	 * This method will split the query string based on space into an array of words
	 * and display it on console
	 */
	// select * from ipl.csv where season > 2018 and city = 'Bangalore';
	public String[] getSplitStrings(String queryString) {

		String[] splitted = queryString.split(" ");
		int len = splitted.length;
		System.out.println("The following are the Splitted words");
		for (int i = 0; i < len; i++) {
			System.out.println(splitted[i]);
		}
		return null;
	}

	/*
	 * Extract the name of the file from the query. File name can be found after a
	 * space after "from" clause. Note: ----- CSV file can contain a field that
	 * contains from as a part of the column name. For eg: from_date,from_hrs etc.
	 * 
	 * Please consider this while extracting the file name in this method.
	 */

	public String getFileName(String queryString) {
//		int fromIndex = queryString.indexOf("from");
//		int whereIndex = queryString.indexOf("where|group by| ");
//		String fileName = queryString.substring(fromIndex + 5, whereIndex);
		String[] splitted = queryString.split(" ");
		int len = splitted.length;
		String fileName = "";
		for (int count = 0; count < len; count++) {
			if (splitted[count].endsWith(".csv")) {
				fileName = splitted[count];
			}
		}
		return fileName;
	}

	/*
	 * This method is used to extract the baseQuery from the query string. BaseQuery
	 * contains from the beginning of the query till the where clause
	 * 
	 * Note: ------- 1. The query might not contain where clause but contain order
	 * by or group by clause 2. The query might not contain where, order by or group
	 * by clause 3. The query might not contain where, but can contain both group by
	 * and order by clause
	 */

	public String getBaseQuery(String queryString) {

		String[] str = queryString.split("where");
		System.out.println("\n" + str[0]);

		return null;
	}

	/*
	 * This method will extract the fields to be selected from the query string. The
	 * query string can have multiple fields separated by comma. The extracted
	 * fields will be stored in a String array which is to be printed in console as
	 * well as to be returned by the method
	 * 
	 * Note: 1. The field name or value in the condition can contain keywords as a
	 * substring. For eg: from_city,job_order_no,group_no etc. 2. The field name can
	 * contain '*'
	 * 
	 */

	public String[] getFields(String queryString) {

		String query = " select city,winner,player_match from ipl.csv where season > 2018 and city = 'Bangalore'; ";
		String strField = query.substring(query.indexOf("select") + 6, query.indexOf("from"));
		String[] fields = strField.split(",");
		for (String word : fields) { // using java for-each loop to print elements of string array
			System.out.println("\n" + word);
		}

		return null;
	}

	/*
	 * This method is used to extract the conditions part from the query string. The
	 * conditions part contains starting from where keyword till the next keyword,
	 * which is either group by or order by clause. In case of absence of both group
	 * by and order by clause, it will contain till the end of the query string.
	 * Note: 1. The field name or value in the condition can contain keywords as a
	 * substring. For eg: from_city,job_order_no,group_no etc. 2. The query might
	 * not contain where clause at all.
	 */

	public String getConditionsPartQuery(String queryString) {
		String[] str = queryString.split("where");
		String str1 = str[1];
		String[] str2 = str1.split("and");

		String str3 = str2[0];
		String[] op = { ">", "=" };
		String str4 = str2[1];

		String[] s6 = str3.split("[>]");
		System.out.println("Condition : 1");
		System.out.println("	Variable :" + s6[0]);
		System.out.println("	Operator : " + op[0]);
		System.out.println("	Value : " + s6[1]);

		String[] s7 = str4.split("[=]");
		System.out.println("Condition : 2");
		System.out.println("	Variable :" + s7[0]);
		System.out.println("	Operator : " + op[1]);
		System.out.println("	Value : " + s7[1]);

		return null;
	}

	/*
	 * This method will extract condition(s) from the query string. The query can
	 * contain one or multiple conditions. In case of multiple conditions, the
	 * conditions will be separated by AND/OR keywords. for eg: Input: select
	 * city,winner,player_match from ipl.csv where season > 2014 and city
	 * ='Bangalore'
	 * 
	 * This method will return a string array ["season > 2014","city ='bangalore'"]
	 * and print the array
	 * 
	 * Note: ----- 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */

	public String[] getConditions(String queryString) {

		String[] str = queryString.split("where");
		String str1 = str[1];
		String[] str2 = str1.split("and");
		int i = 0;

		for (String s : str2) {

			System.out.println("condition " + (++i) + " : " + s);
		}

		return null;
	}

	/*
	 * This method will extract logical operators(AND/OR) from the query string. The
	 * extracted logical operators will be stored in a String array which will be
	 * returned by the method and the same will be printed Note: 1. AND/OR keyword
	 * will exist in the query only if where conditions exists and it contains
	 * multiple conditions. 2. AND/OR can exist as a substring in the conditions as
	 * well. For eg: name='Alexander',color='Red' etc. Please consider these as well
	 * when extracting the logical operators.
	 * 
	 */

	public String[] getLogicalOperators(String queryString) {
		String s = "select season,winner,player_match from ipl.csv where season > 2014 and";
		String[] words = s.split("\\s");

		for (String w : words) {
			if (w.matches("and")) {
				System.out.println("\noperator 1: and");
			}

		}
		String s1 = "  city ='Bangalore' or date > '31-12-2014';";
		String[] word = s1.split("\\s");
		for (String p : word) {
			if (p.matches("or")) {
				System.out.println("\noperator 2: or");

			}
		}
		return null;
	}

	/*
	 * This method extracts the order by fields from the query string. Note: 1. The
	 * query string can contain more than one order by fields. 2. The query string
	 * might not contain order by clause at all. 3. The field names,condition values
	 * might contain "order" as a substring. For eg:order_number,job_order Consider
	 * this while extracting the order by fields
	 */

	public String[] getOrderByFields(String queryString) {
		String query = "select * from ipl.csv where season > 2016 and city='Bangalore' order by win_by_runs";
		String[] part = query.split("order by");
		System.out.println("\n" + part[1]);

		return null;
	}

	/*
	 * This method extracts the group by fields from the query string. Note: 1. The
	 * query string can contain more than one group by fields. 2. The query string
	 * might not contain group by clause at all. 3. The field names,condition values
	 * might contain "group" as a substring. For eg: newsgroup_name
	 * 
	 * Consider this while extracting the group by fields
	 */

	public String[] getGroupByFields(String queryString) {

		String s = "select team1, sum(win_by_runs) from ipl.csv where season > 2018 and city='Bangalore' group by team1";
		String[] str = s.split("group by");
		System.out.println("\n" + str[1]);

		return null;
	}

	/*
	 * This method extracts the aggregate functions from the query string. Note: 1.
	 * aggregate functions will start with "sum"/"count"/"min"/"max"/"avg" followed
	 * by "(" 2. The field names might contain"sum"/"count"/"min"/"max"/"avg" as a
	 * substring. For eg: account_number,consumed_qty,nominee_name
	 * 
	 * Consider this while extracting the aggregate functions
	 */

	public String[] getAggregateFunctions(String queryString) {
		String query = queryString.toLowerCase();
		String[] words = query.split(" ");
		String result = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith("max( |min( |sum( |avg( |count(") && words[i].endsWith(")")) {
				result += words[i] + " ";
			}
		}

		return result.split(",");
	}

	static public void main(String[] args) {
		Assignment1 obj = new Assignment1();

		String query;
		System.out.println("Enter a query string: ");
		Scanner sc = new Scanner(System.in);
		query = sc.nextLine();

		System.out.println(obj.getSplitStrings(query));

		System.out.println(obj.getFileName(query));

		System.out.println(obj.getBaseQuery(query));

		System.out.println(obj.getFields(query));

		System.out.println(obj.getConditionsPartQuery(query));

		System.out.println(obj.getConditions(query));

		System.out.println(obj.getLogicalOperators(query));

		System.out.println(obj.getGroupByFields(query));

		System.out.println(obj.getOrderByFields(query));

		System.out.println(obj.getAggregateFunctions(query));

		sc.close();
	}
}
