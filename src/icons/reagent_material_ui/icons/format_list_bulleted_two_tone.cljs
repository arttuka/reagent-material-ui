(ns reagent-material-ui.icons.format-list-bulleted-two-tone
  "Imports @material-ui/icons/FormatListBulletedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-list-bulleted-two-tone (create-svg-icon [(e "path" #js {"d" "M7 5h14v2H7z"}) (e "circle" #js {"cx" "4", "cy" "6", "r" "1.5"}) (e "path" #js {"d" "M7 11h14v2H7zm0 6h14v2H7zm-3 2.5c.82 0 1.5-.68 1.5-1.5s-.67-1.5-1.5-1.5-1.5.68-1.5 1.5.68 1.5 1.5 1.5z"}) (e "circle" #js {"cx" "4", "cy" "12", "r" "1.5"})]
                                                    "FormatListBulletedTwoTone"))
