(ns reagent-material-ui.icons.qr-code-rounded
  "Imports @material-ui/icons/QrCodeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def qr-code-rounded (create-svg-icon (e "path" #js {"d" "M5 11h4c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2zm0-6h4v4H5V5zm0 16h4c1.1 0 2-.9 2-2v-4c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2zm0-6h4v4H5v-4zm8-10v4c0 1.1.9 2 2 2h4c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2zm6 4h-4V5h4v4zm2 11.5v-1c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5v1c0 .28.22.5.5.5h1c.28 0 .5-.22.5-.5zm-8-7v1c0 .28.22.5.5.5h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5zm3.5 1.5h-1c-.28 0-.5.22-.5.5v1c0 .28.22.5.5.5h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5zM13 17.5v1c0 .28.22.5.5.5h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5zm2.5 3.5h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5v1c0 .28.22.5.5.5zm2-2h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5v1c0 .28.22.5.5.5zm1-6h-1c-.28 0-.5.22-.5.5v1c0 .28.22.5.5.5h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5zm1 4h1c.28 0 .5-.22.5-.5v-1c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5v1c0 .28.22.5.5.5z"})
                                      "QrCodeRounded"))
