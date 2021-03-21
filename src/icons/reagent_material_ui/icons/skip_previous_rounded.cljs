(ns reagent-material-ui.icons.skip-previous-rounded
  "Imports @material-ui/icons/SkipPreviousRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def skip-previous-rounded (create-svg-icon (e "path" #js {"d" "M7 17V7c0-.55-.45-1-1-1s-1 .45-1 1v10c0 .55.45 1 1 1s1-.45 1-1zm9.45-9.96l-6.2 4.13c-.59.4-.59 1.27 0 1.66l6.2 4.13c.66.44 1.55-.03 1.55-.83V7.87c0-.8-.89-1.28-1.55-.83z"})
                                            "SkipPreviousRounded"))
