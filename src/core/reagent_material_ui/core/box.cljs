(ns reagent-material-ui.core.box
  "Imports @material-ui/core/Box as a Reagent component.
   Original documentation is at https://material-ui.com/api/box/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Box" :as Box]))

(def box (adapt-react-class (or (.-default Box) (.-Box Box)) "mui-box"))
