(ns reagent-material-ui.core.styled-engine-provider
  "Imports @material-ui/core/StyledEngineProvider as a Reagent component.
   Original documentation is at https://material-ui.com/api/styled-engine-provider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StyledEngineProvider" :as MuiStyledEngineProvider]))

(def styled-engine-provider (adapt-react-class (or (.-default MuiStyledEngineProvider) (.-StyledEngineProvider MuiStyledEngineProvider)) "mui-styled-engine-provider"))
