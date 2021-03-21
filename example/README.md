# reagent-material-ui example

Example project demonstrating `arttuka/reagent-material-ui`. Server will run at http://localhost:9500/

### Run with Figwheel Main

#### Leiningen + CLJSJS deps

    lein run:dev

#### Leiningen + NPM deps

Uncomment the dependency exclusions in `project.clj` for `arttuka/reagent-material-ui`, then

    npm install
    lein run:npm

#### Clojure CLI + CLJSJS deps

    clj -M:run-dev

#### Clojure CLI + NPM deps

Uncomment the dependency exclusions in `project.clj` for `arttuka/reagent-material-ui`, then

    npm install
    clj -M:run-npm
    
### Run with shadow-cljs

    npm install
    npm run watch
