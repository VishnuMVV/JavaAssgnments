package com.stackroute.exercises3;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public void setTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ": minute=" + minute + ": second=" + second + "]";
	}

}
