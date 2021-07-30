(ns reagent-material-ui.icons.drive-eta-outlined
  "Imports @material-ui/icons/DriveEtaOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def drive-eta-outlined (create-svg-icon [(e "path" #js {"d" "M18.92 5.01C18.72 4.42 18.16 4 17.5 4h-11c-.66 0-1.21.42-1.42 1.01L3 11v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-8l-2.08-5.99zM6.85 6h10.29l1.04 3H5.81l1.04-3zM19 16H5v-4.66l.12-.34h13.77l.11.34V16z"}) (e "circle" #js {"cx" "7.5", "cy" "13.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "13.5", "r" "1.5"})]
                                         "DriveEtaOutlined"))
