package com.revature.model;

public class request {

		private String status;
		private int amount;
		private String managerID;
		private String username;
		private int req_id;
		
		
		public request(String status, int amount, String managerID, String username, int req_id) {
			super();
			this.status = status;
			this.amount = amount;
			this.managerID = managerID;
			this.username = username;
			this.req_id = req_id;
		}

		public request(String username, int amount) {
			super();
			this.username = username;
			this.amount = amount;
			this.status = "pending";
			this.managerID = "";
		}
		
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public String getManagerID() {
			return managerID;
		}

		public void setManagerID(String managerID) {
			this.managerID = managerID;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public int getReq_id() {
			return req_id;
		}

		public void setReq_id(int req_id) {
			this.req_id = req_id;
		}
		
		
		
		
		
}
