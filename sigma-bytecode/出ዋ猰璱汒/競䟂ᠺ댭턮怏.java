public final class \u51fa\u12cb\u7330\u74b1\u6c52.\u7af6\u47c2\u183a\ub32d\ud12e\u600f {
    private void \u7af6\u47c2\u183a\ub32d\ud12e\u600f(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u98a4\ubb2b\u0c95\u7d52\u7049\u120d p1, int p2) {
        var_6_80 : int
        var_7_A0 : int
        var_8_A9 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d)
            invokespecial:Object(Object::<init>, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)
            putfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, newarray:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350.class, add:int(p2:int, and:int(ldc:int(17421), ldc:int(353)))))
            var_6_80 = and:int(ldc:int(-3551), ldc:int(1494))
            
            while (cmplt:boolean(var_6_80:int, arraylength:int(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))) {
                var_7_A0 = shr:int(invokestatic:int(\u98a4\ubb2b\u0c95\u7d52\u7049\u120d::\u527a\uc31c\uf995\u3a62\u927d\u0c95, p1:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d), var_6_80:int)
                var_8_A9 = shr:int(invokestatic:int(\u98a4\ubb2b\u0c95\u7d52\u7049\u120d::\ufcaf\ua562\ud12e\u7873\u3e2a\uceb8, p1:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d), var_6_80:int)
                
                if (cmpeq:boolean(loadelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f), var_6_80:int), aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                    storeelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f), var_6_80:int, initobject:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::<init>, var_7_A0:int, var_8_A9:int, and:int[expected:boolean](ldc:int(-32666), ldc:int(32513))))
                }
                
                inc:int(var_6_80, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4c04\u6b5f\u392e\u4cd9\u64f2\u4d85() {
        var_1_5F : int
        var_3_7D : double
        var_5_8F : int
        stack_C0_0 : int [generated]
        var_1_1C8 : int
        var_7_DE : int
        var_8_117 : int
        var_9_170 : int
        var_10_17F : int
        var_11_188 : int
        var_12_1C2 : int
        var_13_1EB : int
        var_14_1F9 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(-917632658), ldc:int(-350830744))
            var_3_7D = sub:double(ldc:double(1.0), div:double(i2d:double(invokestatic:int(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u3a62\u8c8a\u4ab3\u3d64\ub102\u0b8e, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))), i2d:double(invokevirtual:int(\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99::\u8cae\u93a2\u4d85\u67e9\u61a4\u5f50, invokestatic:\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u93a2\u7af6\ufcaf\ubded\u9af2\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), invokestatic:int(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u3c25\u47c2\u0a06\ub83f\u76bc\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))))))
            var_5_8F = invokevirtual:int(\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99::\u759a\u7873\u4c2b\ua3b4\u16f6\ub1b9, invokestatic:\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u93a2\u7af6\ufcaf\ubded\u9af2\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), invokestatic:int(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u3c25\u47c2\u0a06\ub83f\u76bc\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))
            
            if (cmpne:boolean(invokevirtual:int(\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99::\u3c25\ua068\u1833\ub83f\u98a4\u7006, invokestatic:\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u93a2\u7af6\ufcaf\ubded\u9af2\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-286901911))
                stack_C0_0 = invokevirtual:int(\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99::\u3c25\ua068\u1833\ub83f\u98a4\u7006, invokestatic:\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u93a2\u7af6\ufcaf\ubded\u9af2\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))
            }
            else {
                stack_C0_0 = invokevirtual:int(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u3a62\u92ee\u6fb0\u8389\u600f\u92ff, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))
            }
            
            var_1_1C8 = and:int(var_1_5F:int, ldc:int(-401699477))
            var_7_DE = invokevirtual:int(\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99::\u759a\u7873\u4c2b\ua3b4\u16f6\ub1b9, invokestatic:\u4cd9\u74b1\u92ff\u67d0\u5654\u6d99(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u93a2\u7af6\ufcaf\ubded\u9af2\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), rem:int(add:int(invokestatic:int(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u3c25\u47c2\u0a06\ub83f\u76bc\u88c5, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), xor:int(ldc:int(4355), ldc:int(4354))), stack_C0_0:int))
            
            if (cmpne:boolean(var_5_8F:int, var_7_DE:int)) {
                if (cmpge:boolean(var_7_DE:int, ldc:int(0))) {
                    if (cmplt:boolean(var_7_DE:int, invokevirtual:int(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u3a62\u92ee\u6fb0\u8389\u600f\u92ff, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))) {
                        var_8_117 = and:int(ldc:int(1876), ldc:int(-6005))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_1C8:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-889259157))
                                
                                if (cmplt:boolean(var_8_117:int, arraylength:int(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))) {
                                    var_9_170 = shr:int(invokestatic:int(\u98a4\ubb2b\u0c95\u7d52\u7049\u120d::\u527a\uc31c\uf995\u3a62\u927d\u0c95, invokestatic:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u624e\u6435\u93a2\uc84e\ucb79\u6c56, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))), var_8_117:int)
                                    var_10_17F = shr:int(invokestatic:int(\u98a4\ubb2b\u0c95\u7d52\u7049\u120d::\ufcaf\ua562\ud12e\u7873\u3e2a\uceb8, invokestatic:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u624e\u6435\u93a2\uc84e\ucb79\u6c56, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))), var_8_117:int)
                                    var_11_188 = and:int(ldc:int(17031), ldc:int(-17032))
                                    
                                    loop {
                                        if (cmpeq:boolean(and:int(var_1_1C8:int, ldc:int(268435456)), ldc:int(0))) {
                                            var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-617145875))
                                            
                                            if (cmplt:boolean(var_11_188:int, var_10_17F:int)) {
                                                var_12_1C2 = and:int(ldc:int(-20850), ldc:int(4465))
                                                
                                                loop {
                                                    var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-559992840))
                                                    
                                                    if (cmpge:boolean(var_12_1C2:int, var_9_170:int)) {
                                                        looporswitchbreak()
                                                    }
                                                    
                                                    var_13_1EB = invokespecial:int(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u7bad\uc910\u64f2\u7bad\u6d69\u76bc, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, var_5_8F:int, var_8_117:int, var_12_1C2:int, var_11_188:int)
                                                    var_14_1F9 = invokespecial:int(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u7bad\uc910\u64f2\u7bad\u6d69\u76bc, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, var_7_DE:int, var_8_117:int, var_12_1C2:int, var_11_188:int)
                                                    invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u36d3\u59ec\u8640\u392e\u3dd3\ub32d, loadelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f), var_8_117:int), var_12_1C2:int, var_11_188:int, or:int(or:int(or:int(and:int(var_13_1EB:int, ldc:int(-16777216)), shl:int(invokespecial:int(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ucef1\u3711\ud171\ud12e\uc4d2\uc9f6, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, var_3_7D:double, and:int(shr:int(var_13_1EB:int, ldc:int(16)), and:int(ldc:int(23295), ldc:int(255))), and:int(shr:int(var_14_1F9:int, ldc:int(16)), xor:int(ldc:int(1535), ldc:int(1280)))), ldc:int(16))), shl:int(invokespecial:int(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ucef1\u3711\ud171\ud12e\uc4d2\uc9f6, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, var_3_7D:double, and:int(shr:int(var_13_1EB:int, ldc:int(8)), and:int(ldc:int(22527), ldc:int(8447))), and:int(shr:int(var_14_1F9:int, ldc:int(8)), and:int(ldc:int(255), ldc:int(20735)))), ldc:int(8))), invokespecial:int(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ucef1\u3711\ud171\ud12e\uc4d2\uc9f6, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, var_3_7D:double, and:int(var_13_1EB:int, and:int(ldc:int(4607), ldc:int(767))), and:int(var_14_1F9:int, xor:int(ldc:int(8425), ldc:int(8214))))))
                                                    inc:int(var_12_1C2, ldc:int(1))
                                                }
                                                
                                                var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-637546497))
                                                inc:int(var_11_188, ldc:int(1))
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_1C8:int, ldc:int(131072)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-2077967793))
                                    }
                                    
                                    var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-82331158))
                                    inc:int(var_8_117, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1C8:int, ldc:int(256)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-248324065))
                        }
                        
                        var_1_1C8 = and:int(var_1_1C8:int, ldc:int(-912913537))
                        invokestatic:void(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u8258\u156b\u0a06\u74b1\uc29a\ub70c, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f), and:int(ldc:int(18656), ldc:int(-28129)), and:int(ldc:int(-14393), ldc:int(14392)), getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u7bad\uc910\u64f2\u7bad\u6d69\u76bc(int p0, int p1, int p2, int p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u6d99\u5bc4\ubefe\uc2e8\u64ab\u6c52, loadelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u6bb9\ucef1\u93a2\u8c8a\u3bc9\ud523, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), p1:int), add:int(p2:int, shr:int(mul:int(loadelement:int(invokestatic:int[](\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u392e\u927d\u7ce1\u960f\u4975\u5654, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), p0:int), invokestatic:int(\u98a4\ubb2b\u0c95\u7d52\u7049\u120d::\u527a\uc31c\uf995\u3a62\u927d\u0c95, invokestatic:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u624e\u6435\u93a2\uc84e\ucb79\u6c56, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))), p1:int)), add:int(p3:int, shr:int(mul:int(loadelement:int(invokestatic:int[](\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u72f1\u516c\uc87f\u93a2\u9033\uc2bd, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)), p0:int), invokestatic:int(\u98a4\ubb2b\u0c95\u7d52\u7049\u120d::\ufcaf\ua562\ud12e\u7873\u3e2a\uceb8, invokestatic:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u624e\u6435\u93a2\uc84e\ucb79\u6c56, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\ufcaf\ud51e\ubcb0\u156b\u6d69\ub19c, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)))), p1:int))))
        }
        
        goto(Label_0006)
    }
    
    private int \ucef1\u3711\ud171\ud12e\uc4d2\uc9f6(double p0, int p1, int p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(d2i:int(add:double(mul:double(p0:double, i2d:double(p1:int)), mul:double(sub:double(ldc:double(1.0), p0:double), i2d:double(p2:int)))))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
        var_1_5F : int
        var_3_64 : \u5db4\ud523\u7043\u6c52\u8308\u8350[]
        var_4_67 : int
        var_5_70 : int
        var_6_8C : \u5db4\ud523\u7043\u6c52\u8308\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(-341906894), ldc:int(-872750862))
            var_3_64 = getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4f4a\u59ec\u392e\u4cd9\u92ff\u9255, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)
            var_4_67 = arraylength:int(var_3_64:\u5db4\ud523\u7043\u6c52\u8308\u8350[])
            var_5_70 = and:int(ldc:int(-5892), ldc:int(5891))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-543480854))
                
                if (cmpge:boolean(var_5_70:int, var_4_67:int)) {
                    looporswitchbreak()
                }
                
                var_6_8C = loadelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_3_64:\u5db4\ud523\u7043\u6c52\u8308\u8350[], var_5_70:int)
                
                if (cmpne:boolean(var_6_8C:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                    invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_6_8C:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                }
                
                inc:int(var_5_70, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\u47c2\u183a\ub32d\ud12e\u600f(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u98a4\ubb2b\u0c95\u7d52\u7049\u120d p1, int p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3d64\u98a4\ube23\u8753\u51fa\u8308 p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\u7af6\u47c2\u183a\ub32d\ud12e\u600f(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::<init>, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f, p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d, p1:\u98a4\ubb2b\u0c95\u7d52\u7049\u120d, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5140\u67e9\uc4d2\u12cb\u4ab3\u759a(\u51fa\u12cb\u7330\u74b1\u6c52.\u7af6\u47c2\u183a\ub32d\ud12e\u600f p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u7af6\u47c2\u183a\ub32d\ud12e\u600f::\u4c04\u6b5f\u392e\u4cd9\u64f2\u4d85, p0:\u7af6\u47c2\u183a\ub32d\ud12e\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uceb8\ub8be\u12cb\u8cae\uf94d\u92ee(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_640 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_635 = and:int(ldc:int(-1666283553), ldc:int(-1125402625))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7af6\u47c2\u183a\ub32d\ud12e\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(-1091869587))
            var_5_7D = and:int(ldc:int(14593), ldc:int(-14594))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3100), ldc:int(-19487)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_635:int, ldc:int(-1749222658))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(10439), ldc:int(17409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(18465), ldc:int(18464)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_CA:int, ldc:int(-1762737302))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(267), ldc:int(266)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-186122044))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1091700624))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(298235548))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1718366601))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1614963891))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(540187478))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2000639936))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(854910475))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-949264698))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(870968979))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-2136754476))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1226094226))
                        var_11_DB = and:int(ldc:int(-14185), ldc:int(14120))
                        goto(Label_1473)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1028792939))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1351440284))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1168516950))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(468009032))
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1855977150))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1746032520))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-153348082))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(300356019))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2135895216))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(990571880))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-977767108))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-596206684))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-38154273))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0811:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-990820104))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1794316024))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2109284391))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-594977901))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1383042371))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-488620711))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1073859380))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(19209), ldc:int(17))
                                goto(Label_1098)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-121775387))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(299192544))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(887454842))
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(522787115))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1208233144))
                        var_11_DB = and:int(ldc:int(17505), ldc:int(-17506))
                    }
                    
                    Label_1098:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-570840268))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(2039438389))
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1350909594))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1457843))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1354)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(93243950))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(928386117))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-843503307))
                            goto(Label_1098)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1800528233))
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1698186677))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(198086097))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-575896840))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1473)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1354:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2056812891))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1722923386))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(330320553))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(-172278023))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-518702013))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1610867505))
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1328964297))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-189939461))
                        var_17_640 = add:int(var_16_109:int, and:int(ldc:int(1217), ldc:int(4103)))
                        looporswitchbreak()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(1547821414))
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(-726715687))
                
                if (cmple:boolean(var_5_7D = var_17_640:int, sub:int(var_6_84:int, and:int(ldc:int(1159), ldc:int(12609))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
