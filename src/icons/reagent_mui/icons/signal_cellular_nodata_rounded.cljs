(ns reagent-mui.icons.signal-cellular-nodata-rounded
  "Imports @mui/icons-material/SignalCellularNodataRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-nodata-rounded (create-svg-icon (e "path" #js {"d" "M22 13h-7c-1.1 0-2 .9-2 2v7H4.41c-.89 0-1.34-1.08-.71-1.71L20.29 3.71c.63-.63 1.71-.19 1.71.7V13zm-1.7 1.71a.9959.9959 0 0 0-1.41 0L17.5 16.1l-1.39-1.39a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l1.39 1.39-1.39 1.39c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l1.39-1.38 1.39 1.38c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-1.38-1.39 1.38-1.39c.39-.39.39-1.02 0-1.41z"})
                                                     "SignalCellularNodataRounded"))
