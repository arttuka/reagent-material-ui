(ns reagent-material-ui.icons.sim-card-download
  "Imports @material-ui/icons/SimCardDownload as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sim-card-download (create-svg-icon (e "path" #js {"d" "M18 2h-8L4 8v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-6 15l-4-4h3V9.02L13 9v4h3l-4 4z"})
                                        "SimCardDownload"))
