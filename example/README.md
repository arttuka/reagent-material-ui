# reagent-material-ui example

Example project demonstrating `arttuka/reagent-material-ui`. Server will run at http://localhost:9500/

### Run with Figwheel Main

#### Leiningen + CLJSJS deps

    lein run:dev

#### Leiningen + NPM deps

Uncomment the dependency exclusion in `project.clj` for `arttuka/reagent-material-ui`
and comment out the CLJSJS dependencies, then

    npm install
    lein run:npm

#### Clojure CLI + CLJSJS deps

    clj -M:run-dev

#### Clojure CLI + NPM deps

Uncomment the dependency exclusion in `deps.edn` for `arttuka/reagent-material-ui`
and comment out the CLJSJS dependencies, then

    npm install
    clj -M:run-npm
    
### Run with shadow-cljs

    npm install
    npm run watch
