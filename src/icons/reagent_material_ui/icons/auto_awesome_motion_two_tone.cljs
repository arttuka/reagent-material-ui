(ns reagent-material-ui.icons.auto-awesome-motion-two-tone
  "Imports @material-ui/icons/AutoAwesomeMotionTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def auto-awesome-motion-two-tone (create-svg-icon [(e "path" #js {"d" "M12 12h8v8h-8z", "opacity" ".3"}) (e "path" #js {"d" "M14 2H4c-1.1 0-2 .9-2 2v10h2V4h10V2zm6 8h-8c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2v-8c0-1.1-.9-2-2-2zm0 10h-8v-8h8v8z"}) (e "path" #js {"d" "M18 6H8c-1.1 0-2 .9-2 2v10h2V8h10V6z"})]
                                                   "AutoAwesomeMotionTwoTone"))
