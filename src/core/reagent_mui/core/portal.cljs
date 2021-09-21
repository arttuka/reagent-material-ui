(ns reagent-mui.core.portal
  "Imports @mui/core/Portal as a Reagent component.
   Original documentation is at https://mui.com/api/portal/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/Portal" :as MuiPortal]))

(def portal (adapt-react-class (.-default MuiPortal) "mui-portal"))