(ns reagent-material-ui.icons.signal-cellular-alt-outlined
  "Imports @material-ui/icons/SignalCellularAltOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-alt-outlined (create-svg-icon (e "path" #js {"d" "M17 4h3v16h-3V4zM5 14h3v6H5v-6zm6-5h3v11h-3V9z"})
                                                   "SignalCellularAltOutlined"))
