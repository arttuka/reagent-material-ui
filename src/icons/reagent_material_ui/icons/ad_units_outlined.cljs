(ns reagent-material-ui.icons.ad-units-outlined
  "Imports @material-ui/icons/AdUnitsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ad-units-outlined (create-svg-icon [(e "path" #js {"d" "M17 1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zM7 4V3h10v1H7zm0 14V6h10v12H7zm0 3v-1h10v1H7z"}) (e "path" #js {"d" "M16 7H8v2h8V7z"})]
                                        "AdUnitsOutlined"))
