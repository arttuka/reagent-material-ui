(ns reagent-material-ui.core.no-ssr
  "Imports @material-ui/core/NoSsr as a Reagent component.
   Original documentation is at https://material-ui.com/api/no-ssr/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/NoSsr" :as MuiNoSsr]))

(def no-ssr (adapt-react-class (or (.-default MuiNoSsr) (.-NoSsr MuiNoSsr)) "mui-no-ssr"))
