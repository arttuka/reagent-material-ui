(ns reagent-material-ui.icons.sim-card-download-two-tone
  "Imports @material-ui/icons/SimCardDownloadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sim-card-download-two-tone (create-svg-icon [(e "path" #js {"d" "M6 8.83V20h12V4h-7.17L6 8.83zm5 .19L13 9v4h3l-4 4-4-4h3V9.02z", "opacity" ".3"}) (e "path" #js {"d" "M18 2h-8L4 8v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 18H6V8.83L10.83 4H18v16z"}) (e "path" #js {"d" "m12 17 4-4h-3V9l-2 .02V13H8z"})]
                                                 "SimCardDownloadTwoTone"))
