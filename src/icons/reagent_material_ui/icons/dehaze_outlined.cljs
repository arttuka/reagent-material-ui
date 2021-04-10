(ns reagent-material-ui.icons.dehaze-outlined
  "Imports @material-ui/icons/DehazeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dehaze-outlined (create-svg-icon (e "path" #js {"d" "M2 16v2h20v-2H2zm0-5v2h20v-2H2zm0-5v2h20V6H2z"})
                                      "DehazeOutlined"))
