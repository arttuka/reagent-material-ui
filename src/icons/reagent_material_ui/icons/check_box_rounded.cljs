(ns reagent-material-ui.icons.check-box-rounded
  "Imports @material-ui/icons/CheckBoxRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def check-box-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM9.88 15.54l-2.83-2.83a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l2.12 2.12 4.95-4.95c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41l-5.66 5.66c-.38.39-1.01.39-1.4 0z"})
                                        "CheckBoxRounded"))
