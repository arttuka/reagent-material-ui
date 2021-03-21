(ns reagent-material-ui.icons.wb-auto-rounded
  "Imports @material-ui/icons/WbAutoRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wb-auto-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8.14 9.3l-1.01 2.89h2.09L8.2 9.3z"}) (e "path" #js {"d" "M22.42 8c-.27 0-.51.19-.57.45l-1.1 4.65h-.06l-1.33-4.57c-.09-.31-.38-.53-.71-.53-.32 0-.61.21-.7.52l-1.4 4.59h-.05l-1.1-4.66c-.06-.26-.3-.45-.57-.45-.32 0-.55.26-.57.55C13.06 6.43 10.79 5 8.17 5c-3.87 0-7 3.13-7 7s3.13 7 7 7c3.83 0 6.93-3.08 6.99-6.89l.62 2.33c.09.33.38.56.72.56.33 0 .62-.22.72-.54l1.4-4.7h.06L20 14.45c.1.33.39.55.73.55h.02c.34 0 .64-.23.72-.56l1.51-5.71c.1-.37-.18-.73-.56-.73zm-11.8 7c-.24 0-.45-.15-.53-.38l-.49-1.41H6.77l-.5 1.42c-.09.22-.3.37-.54.37-.39 0-.67-.39-.53-.76l2.12-5.65c.14-.36.48-.59.85-.59s.71.23.85.59l2.12 5.65c.14.37-.13.76-.52.76z"}))
                                      "WbAutoRounded"))
