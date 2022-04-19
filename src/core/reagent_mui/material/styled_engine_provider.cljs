(ns reagent-mui.material.styled-engine-provider
  "Imports @mui/material/StyledEngineProvider as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/styled-engine-provider/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/StyledEngineProvider" :as MuiStyledEngineProvider]))

(def styled-engine-provider (adapt-react-class (.-default MuiStyledEngineProvider) "mui-styled-engine-provider"))
