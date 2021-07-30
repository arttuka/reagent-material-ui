(ns reagent-material-ui.icons.dock-two-tone
  "Imports @material-ui/icons/DockTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dock-two-tone (create-svg-icon [(e "path" #js {"d" "M8 5h8v10H8z", "opacity" ".3"}) (e "path" #js {"d" "M8 21h8v2H8zm8-19.99L8 1c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM16 15H8V5h8v10z"})]
                                    "DockTwoTone"))
