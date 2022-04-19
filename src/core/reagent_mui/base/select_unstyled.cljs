(ns reagent-mui.base.select-unstyled
  "Imports @mui/base/SelectUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/select-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/SelectUnstyled" :as MuiSelectUnstyled]))

(def select-unstyled (adapt-react-class (.-default MuiSelectUnstyled) "mui-select-unstyled"))
