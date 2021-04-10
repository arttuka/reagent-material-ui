(ns reagent-material-ui.core.stack
  "Imports @material-ui/core/Stack as a Reagent component.
   Original documentation is at https://material-ui.com/api/stack/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Stack" :as MuiStack]))

(def stack (adapt-react-class (.-default MuiStack) "mui-stack"))
