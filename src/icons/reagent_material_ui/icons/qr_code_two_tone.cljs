(ns reagent-material-ui.icons.qr-code-two-tone
  "Imports @material-ui/icons/QrCodeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def qr-code-two-tone (create-svg-icon [(e "path" #js {"d" "M5 15h4v4H5zM5 5h4v4H5zm10 0h4v4h-4z", "opacity" ".3"}) (e "path" #js {"d" "M3 11h8V3H3v8zm2-6h4v4H5V5zM3 21h8v-8H3v8zm2-6h4v4H5v-4zm8-12v8h8V3h-8zm6 6h-4V5h4v4zm0 10h2v2h-2zm-6-6h2v2h-2zm2 2h2v2h-2zm-2 2h2v2h-2zm2 2h2v2h-2zm2-2h2v2h-2zm0-4h2v2h-2zm2 2h2v2h-2z"})]
                                       "QrCodeTwoTone"))
