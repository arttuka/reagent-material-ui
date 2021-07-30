(ns reagent-material-ui.icons.stop-two-tone
  "Imports @material-ui/icons/StopTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stop-two-tone (create-svg-icon [(e "path" #js {"d" "M8 8h8v8H8z", "opacity" ".3"}) (e "path" #js {"d" "M6 18h12V6H6v12zM8 8h8v8H8V8z"})]
                                    "StopTwoTone"))
