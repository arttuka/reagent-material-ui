(ns reagent-material-ui.icons.title-rounded
  "Imports @material-ui/icons/TitleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def title-rounded (create-svg-icon (e "path" #js {"d" "M17.5 4h-11C5.67 4 5 4.67 5 5.5S5.67 7 6.5 7h4v11.5c0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5V7h4c.83 0 1.5-.67 1.5-1.5S18.33 4 17.5 4z"})
                                    "TitleRounded"))
