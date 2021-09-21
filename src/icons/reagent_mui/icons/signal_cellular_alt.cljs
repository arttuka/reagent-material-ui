(ns reagent-mui.icons.signal-cellular-alt
  "Imports @mui/icons-material/SignalCellularAlt as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-alt (create-svg-icon (e "path" #js {"d" "M17 4h3v16h-3zM5 14h3v6H5zm6-5h3v11h-3z"})
                                          "SignalCellularAlt"))
