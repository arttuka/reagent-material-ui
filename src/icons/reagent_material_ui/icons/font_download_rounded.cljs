(ns reagent-material-ui.icons.font-download-rounded
  "Imports @material-ui/icons/FontDownloadRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def font-download-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12.05 8.23h-.1l-1.75 4.96h3.59z"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-3.81 16h-.01c-.41 0-.77-.26-.91-.64l-.85-2.42H9.58l-.86 2.43c-.14.37-.5.63-.9.63H7.8c-.67 0-1.13-.67-.9-1.3L10.55 7c.23-.6.8-1 1.45-1s1.22.4 1.45 1l3.64 9.7c.24.63-.23 1.3-.9 1.3z"}))
                                            "FontDownloadRounded"))
