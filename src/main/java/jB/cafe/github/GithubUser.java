package jB.cafe.github;

import jB.cafe.entity.User;

class GithubUser {
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void copyToUser(User user) {
		user.setGithubId(id);
		user.setFirstname(name);
	}

}