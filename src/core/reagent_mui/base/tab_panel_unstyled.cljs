(ns reagent-mui.base.tab-panel-unstyled
  "Imports @mui/base/TabPanelUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/tab-panel-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/TabPanelUnstyled" :as MuiTabPanelUnstyled]))

(def tab-panel-unstyled (adapt-react-class (.-default MuiTabPanelUnstyled) "mui-tab-panel-unstyled"))
