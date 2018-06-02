DESCRIPTION = "Hello Datormagazin"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "1.0"
PR = "r0"

SRC_URI = "file://hello.c"

S = "${WORKDIR}"

FILES_${PN} = "${bindir}/hello"

do_compile() {
    ${CC} ${WORKDIR}/hello.c ${CFLAGS} ${LDFLAGS} -o hello
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/hello ${D}${bindir}
}
