(ns reagent-material-ui.icons.grade-rounded
  "Imports @material-ui/icons/GradeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def grade-rounded (create-svg-icon (e "path" #js {"d" "M14.43 10l-1.95-6.42c-.14-.47-.81-.47-.96 0L9.57 10H3.56c-.49 0-.69.62-.29.91l4.91 3.51-1.89 6.1c-.14.46.39.84.78.55L12 17.31l4.93 3.75c.39.29.92-.08.78-.55l-1.89-6.1 4.91-3.51c.4-.28.2-.91-.29-.91h-6.01z"})
                                    "GradeRounded"))
