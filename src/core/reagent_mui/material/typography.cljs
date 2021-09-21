(ns reagent-mui.material.typography
  "Imports @mui/material/Typography as a Reagent component.
   Original documentation is at https://mui.com/api/typography/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Typography" :as MuiTypography]))

(def typography (adapt-react-class (.-default MuiTypography) "mui-typography"))
