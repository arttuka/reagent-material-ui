(ns reagent-material-ui.icons.countertops-two-tone
  "Imports @material-ui/icons/CountertopsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def countertops-two-tone (create-svg-icon [(e "path" #js {"d" "M6 6h2v2H6V6zm0 12v-6h5v6H6zm12 0h-5v-6h5v6z", "opacity" ".3"}) (e "path" #js {"d" "M22 10h-4V7c0-1.66-1.34-3-3-3s-3 1.34-3 3h2c0-.55.45-1 1-1s1 .45 1 1v3H8c1.1 0 2-.9 2-2V4H4v4c0 1.1.9 2 2 2H2v2h2v8h16v-8h2v-2zM6 6h2v2H6V6zm0 12v-6h5v6H6zm12 0h-5v-6h5v6z"})]
                                           "CountertopsTwoTone"))
