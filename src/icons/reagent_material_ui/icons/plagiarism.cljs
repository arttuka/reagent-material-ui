(ns reagent-material-ui.icons.plagiarism
  "Imports @material-ui/icons/Plagiarism as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def plagiarism (create-svg-icon [(e "path" #js {"d" "M14 2H6c-1.1 0-2 .9-2 2v16c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6zm1.04 17.45-1.88-1.88c-1.33.71-3.01.53-4.13-.59-1.37-1.37-1.37-3.58 0-4.95s3.58-1.37 4.95 0c1.12 1.12 1.31 2.8.59 4.13l1.88 1.88-1.41 1.41zM13 9V3.5L18.5 9H13z"}) (e "circle" #js {"cx" "11.5", "cy" "14.5", "r" "1.5"})]
                                 "Plagiarism"))
