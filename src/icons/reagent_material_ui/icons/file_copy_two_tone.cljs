(ns reagent-material-ui.icons.file-copy-two-tone
  "Imports @material-ui/icons/FileCopyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def file-copy-two-tone (create-svg-icon [(e "path" #js {"d" "M14 7H8v14h11v-9h-5z", "opacity" ".3"}) (e "path" #js {"d" "M16 1H4c-1.1 0-2 .9-2 2v14h2V3h12V1zm-1 4H8c-1.1 0-1.99.9-1.99 2L6 21c0 1.1.89 2 1.99 2H19c1.1 0 2-.9 2-2V11l-6-6zm4 16H8V7h6v5h5v9z"})]
                                         "FileCopyTwoTone"))
