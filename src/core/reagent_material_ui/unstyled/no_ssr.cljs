(ns reagent-material-ui.unstyled.no-ssr
  "Imports @material-ui/unstyled/NoSsr as a Reagent component.
   Original documentation is at https://material-ui.com/api/no-ssr/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/NoSsr" :as MuiNoSsr]))

(def no-ssr (adapt-react-class (.-default MuiNoSsr) "mui-no-ssr"))
