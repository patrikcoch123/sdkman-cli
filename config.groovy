vertxVersion = '1.3.1.final'
gvmVersion = '0.9.6'
environments {
	dev {
		gvmService = 'http://localhost:8080'
	}
	test {
		gvmService = 'http://test.gvmtool.net'
	}
	prod {
		gvmService = 'http://api.gvmtool.net'
	}
}
