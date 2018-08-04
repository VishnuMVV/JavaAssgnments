//Test case for Assignment1 file

package com.stackroute.assignments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.assignments.Assignment1;

@SuppressWarnings("unused")
class testAssignment1 {

	Assignment1 data = new Assignment1();

	@Test
	public void testGetFileName() {

		assertEquals(
				"File name extraction failed .File name can be found after a space after from clause.Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
				"ipl.csv", data.getFileName("select city,winner,team1,team2 from ipl.csv"));

		assertEquals(
				"File name extraction failed .File name can be found after a space after from clause.Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
				"ipl.csv", data.getFileName("select max(winner),city from ipl.csv group by city"));
	}

	@Test
	public void testGetFileNameFailure() {
		assertNotNull(
				"File name extraction failed. File name can be found after a space after from clause. Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
				data.getFileName("select city,winner,team1,team2 from ipl.csv"));

		assertNotEquals(
				"File name extraction failed. File name can be found after a space after from clause. Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
				"ipl1.csv", data.getFileName("select city,winner,team1,team2 from ipl.csv"));
	}

	// @Test
	// public void testGetBaseQuery() {
	//
	// assertEquals(
	// "testGetBaseQuery(),Retrieval of Base Query failed. BaseQuery contains from
	// the beginning of the query till the where clause",
	// "select city,winner,player_match from ipl.csv",
	// data.getBaseQuery("select city,winner,player_match from ipl.csv where season
	// > 2014"));
	// }
	//
	// @Test
	// public void testGetBaseQueryFailure() {
	//
	// assertNotEquals(
	// "testGetBaseQueryFailure(),Retrieval of Base Query failed. BaseQuery contains
	// from the beginning of the query till the where clause",
	// "select city,winner,player_match from ipl.csv",
	// data.getBaseQuery("select city1,winner,player_match from ipl1.csv where
	// season > 2014"));
	//
	// assertNotNull("testGetBaseQueryFailure() , Retrieval of Base Query returns
	// Null",
	// data.getBaseQuery("select * from ipl.csv"));
	// }

}
