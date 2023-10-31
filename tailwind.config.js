const scalaVersion = require("./scala-version");

module.exports = (api) => {
  const scalajsMode = api.env === "production" ? "opt" : "fastopt";
  return {
    content: [
      `./modules/frontend/target/scala-${scalaVersion}/frontend-${scalajsMode}/*.js`,
      "./index.html",
      "./node_modules/tw-elements/dist/js/**/*.js",
    ],
    plugins: [require("tw-elements/dist/plugin.cjs")],
    theme: {
      extend: {
        fontFamily: {
          Roboto: ["Roboto"],
        },
      },
    },
  };
};
