(ns reagent-material-ui.icons.padding-two-tone
  "Imports @material-ui/icons/PaddingTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def padding-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zM15 7h2v2h-2V7zm-4 0h2v2h-2V7zM7 7h2v2H7V7z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2zm16 14H5V5h14v14z"}) (e "path" #js {"d" "M15 7h2v2h-2zM7 7h2v2H7zm4 0h2v2h-2z"})]
                                       "PaddingTwoTone"))
