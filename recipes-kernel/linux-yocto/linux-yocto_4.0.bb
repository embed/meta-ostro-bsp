KBRANCH ?= "linux-4.0.y"

require recipes-kernel/linux/linux-yocto.inc

S = "${WORKDIR}/linux-stable"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Override COMPATIBLE_MACHINE to include your machine in a bbappend
# file. Leaving it empty here ensures an early explicit build failure.
COMPATIBLE_MACHINE = "quark"

SRCREV = "a0ce889438e8204b87d1f30f941646636e26837e"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=${KBRANCH}"

SRC_URI_append_quark = " \
	file://quark/PATCHv6-1-1-thermal-intel-Quark-SoC-X1000-DTS-thermal-driver.patch \
	file://quark/v4-1-2-firmware_loader-introduce-new-API---request_firmware_direct_full_path.patch \
	file://quark/v4-2-2-efi-an-sysfs-interface-for-user-to-update-efi-firmware.patch \
	file://defconfig \
	"

LINUX_VERSION ?= "4.0.6"
