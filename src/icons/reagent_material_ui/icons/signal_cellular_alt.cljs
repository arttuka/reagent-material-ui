(ns reagent-material-ui.icons.signal-cellular-alt
  "Imports @material-ui/icons/SignalCellularAlt as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-alt (create-svg-icon (e "path" #js {"d" "M17 4h3v16h-3zM5 14h3v6H5zm6-5h3v11h-3z"})
                                          "SignalCellularAlt"))
