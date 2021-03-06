(ns reagent-material-ui.icons.signal-cellular-nodata-outlined
  "Imports @material-ui/icons/SignalCellularNodataOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-nodata-outlined (create-svg-icon (e "path" #js {"d" "M22 13h-9v9H2L22 2v11zm-1 2.41L19.59 14l-2.09 2.09L15.41 14 14 15.41l2.09 2.09L14 19.59 15.41 21l2.09-2.08L19.59 21 21 19.59l-2.08-2.09L21 15.41z"})
                                                      "SignalCellularNodataOutlined"))
