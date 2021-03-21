(ns reagent-material-ui.icons.mms-rounded
  "Imports @material-ui/icons/MmsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mms-rounded (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v15.59c0 .89 1.08 1.34 1.71.71L6 18h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-3 12H7c-.41 0-.65-.47-.4-.8l2-2.67c.2-.27.6-.27.8 0L11.25 13l2.6-3.47c.2-.27.6-.27.8 0l2.75 3.67c.25.33.01.8-.4.8z"})
                                  "MmsRounded"))
