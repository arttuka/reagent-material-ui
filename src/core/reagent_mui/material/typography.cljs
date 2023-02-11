(ns reagent-mui.material.typography
  "Imports @mui/material/Typography as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/typography/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Typography" :as MuiTypography]))

(def typography (r/adapt-react-class (.-default MuiTypography)))
