(ns reagent-material-ui.icons.upload-two-tone
  "Imports @material-ui/icons/UploadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def upload-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.83 8H11v6h2V8h1.17L12 5.83z", "opacity" ".3"}) (e "path" #js {"d" "M12 3l-7 7h4v6h6v-6h4l-7-7zm1 5v6h-2V8H9.83L12 5.83 14.17 8H13zM5 18h14v2H5z"}))
                                      "UploadTwoTone"))
