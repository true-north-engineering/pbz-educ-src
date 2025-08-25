
module.exports.params = {
  dbname: process.env.MYSQL_ENV_MYSQL_DATABASE,
  username: process.env.MYSQL_ENV_MYSQL_USER,
  password: process.env.MYSQL_ENV_MYSQL_PASSWORD,
  params: {
      host: process.env.MYSQL_ENV_MYSQL_HOST,
      port: process.env.MYSQL_ENV_MYSQL_PORT,
      dialect: 'mysql'
  }
};
