(ns reagent-mui.material.outlined-input
  "Imports @mui/material/OutlinedInput as a Reagent component.
   Original documentation is at https://mui.com/api/outlined-input/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/OutlinedInput" :as MuiOutlinedInput]))

(def outlined-input (adapt-react-class (.-default MuiOutlinedInput) "mui-outlined-input"))
