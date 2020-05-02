(ns reagent-material-ui.core.outlined-input
  "Imports @material-ui/core/OutlinedInput as a Reagent component.
   Original documentation is at https://material-ui.com/api/outlined-input/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/OutlinedInput" :as MuiOutlinedInput]))

(def outlined-input (adapt-react-class (or (.-default MuiOutlinedInput) (.-OutlinedInput MuiOutlinedInput)) "mui-outlined-input"))
