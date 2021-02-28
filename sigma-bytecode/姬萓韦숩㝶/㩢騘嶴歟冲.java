public class \u59ec\u8413\u97e6\uc229\u3776.\u3a62\u9a18\u5db4\u6b5f\u51b2 {
    public void \u3a62\u9a18\u5db4\u6b5f\u51b2(java.lang.String p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc3e3\u5654\u9937\u527a\u7bad[] p1) {
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
            invokespecial:Object(Object::<init>, this:\u3a62\u9a18\u5db4\u6b5f\u51b2)
            putfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2, p0:String)
            putfield:\uc3e3\u5654\u9937\u527a\u7bad[](\u3a62\u9a18\u5db4\u6b5f\u51b2::\u6b5f\u4e72\uf9c5\u98a4\u8350\ua61f, this:\u3a62\u9a18\u5db4\u6b5f\u51b2, p1:\uc3e3\u5654\u9937\u527a\u7bad[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \uc3e3\uf9c5\u97b7\ub1b9\u12cb\u5245(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, boolean p1) {
        var_3_DE : int
        var_5_AC : StringTextComponent
        var_6_BD : int
        var_7_C3 : \uc3e3\u5654\u9937\u527a\u7bad[]
        var_8_C8 : int
        var_9_D1 : int
        var_10_11F : \uc3e3\u5654\u9937\u527a\u7bad
        var_11_127 : ITextComponent
        
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
        var_3_DE = and:int(ldc:int(-986078100), ldc:int(-46285451))
        
        if (logicaland:boolean(cmpne:boolean(arraylength:int(getfield:\uc3e3\u5654\u9937\u527a\u7bad[](\u3a62\u9a18\u5db4\u6b5f\u51b2::\u6b5f\u4e72\uf9c5\u98a4\u8350\ua61f, this:\u3a62\u9a18\u5db4\u6b5f\u51b2)), ldc:int(0)), p1:boolean)) {
            var_5_AC = initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(String::substring, getfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2), and:int(ldc:int(22104), ldc:int(-22109)), invokevirtual:int(\uc3e3\u5654\u9937\u527a\u7bad::\u7e3f\u392e\u6bb9\u3bd6\u9af2\ud158, loadelement:\uc3e3\u5654\u9937\u527a\u7bad(getfield:\uc3e3\u5654\u9937\u527a\u7bad[](\u3a62\u9a18\u5db4\u6b5f\u51b2::\u6b5f\u4e72\uf9c5\u98a4\u8350\ua61f, this:\u3a62\u9a18\u5db4\u6b5f\u51b2), and:int(ldc:int(-22515), ldc:int(17890))))))
            var_6_BD = invokevirtual:int(\uc3e3\u5654\u9937\u527a\u7bad::\u7e3f\u392e\u6bb9\u3bd6\u9af2\ud158, loadelement:\uc3e3\u5654\u9937\u527a\u7bad(getfield:\uc3e3\u5654\u9937\u527a\u7bad[](\u3a62\u9a18\u5db4\u6b5f\u51b2::\u6b5f\u4e72\uf9c5\u98a4\u8350\ua61f, this:\u3a62\u9a18\u5db4\u6b5f\u51b2), and:int(ldc:int(17283), ldc:int(-21448))))
            var_7_C3 = getfield:\uc3e3\u5654\u9937\u527a\u7bad[](\u3a62\u9a18\u5db4\u6b5f\u51b2::\u6b5f\u4e72\uf9c5\u98a4\u8350\ua61f, this:\u3a62\u9a18\u5db4\u6b5f\u51b2)
            var_8_C8 = arraylength:int(var_7_C3:\uc3e3\u5654\u9937\u527a\u7bad[])
            var_9_D1 = and:int(ldc:int(-14410), ldc:int(12361))
            
            loop {
                if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(256)), ldc:int(0))) {
                    var_3_DE = and:int(var_3_DE:int, ldc:int(958900313))
                }
                else {
                    var_3_DE = and:int(var_3_DE:int, ldc:int(-42832385))
                    
                    if (cmplt:boolean(var_9_D1:int, var_8_C8:int)) {
                        var_10_11F = loadelement:\uc3e3\u5654\u9937\u527a\u7bad(var_7_C3:\uc3e3\u5654\u9937\u527a\u7bad[], var_9_D1:int)
                        var_11_127 = invokevirtual:ITextComponent(\uc3e3\u5654\u9937\u527a\u7bad::\u6fb0\u12cb\u6435\u8d98\u120d\u3bc9, var_10_11F:\uc3e3\u5654\u9937\u527a\u7bad, p0:\u8413\u5140\u64f2\uc9f6\u9937)
                        
                        if (cmplt:boolean(var_6_BD:int, invokevirtual:int(\uc3e3\u5654\u9937\u527a\u7bad::\u7e3f\u392e\u6bb9\u3bd6\u9af2\ud158, var_10_11F:\uc3e3\u5654\u9937\u527a\u7bad))) {
                            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, var_5_AC:StringTextComponent[expected:IFormattableTextComponent], invokevirtual:String(String::substring, getfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2), var_6_BD:int, invokevirtual:int(\uc3e3\u5654\u9937\u527a\u7bad::\u7e3f\u392e\u6bb9\u3bd6\u9af2\ud158, var_10_11F:\uc3e3\u5654\u9937\u527a\u7bad)))
                        }
                        
                        if (cmpne:boolean(var_11_127:ITextComponent, aconstnull:ITextComponent())) {
                            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_5_AC:StringTextComponent[expected:IFormattableTextComponent], var_11_127:ITextComponent)
                        }
                        
                        var_6_BD = invokevirtual:int(\uc3e3\u5654\u9937\u527a\u7bad::\u7e3f\u7873\u52d3\u4e72\u6d99\u5f50, var_10_11F:\uc3e3\u5654\u9937\u527a\u7bad)
                        inc:int(var_9_D1, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_DE = and:int(var_3_DE:int, ldc:int(-26290563))
            }
            
            if (cmplt:boolean(var_6_BD:int, invokevirtual:int(String::length, getfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2)))) {
                invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, var_5_AC:StringTextComponent[expected:IFormattableTextComponent], invokevirtual:String(String::substring, getfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2), var_6_BD:int, invokevirtual:int(String::length, getfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2))))
            }
            
            return:ITextComponent(var_5_AC:StringTextComponent[expected:ITextComponent])
        }
        
        return:ITextComponent(initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, getfield:String(\u3a62\u9a18\u5db4\u6b5f\u51b2::\u8308\u3d4b\u3e75\u64ab\ube23\ub113, this:\u3a62\u9a18\u5db4\u6b5f\u51b2)))
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u3a62\u9a18\u5db4\u6b5f\u51b2 \ubf56\u7043\u8cae\ubded\u3a62\ub7dc(com.mojang.brigadier.StringReader p0, boolean p1) {
        var_2_AE : int
        var_4_74 : String
        var_5_13D : ArrayList
        var_2_164 : int
        var_6_148 : int
        var_2_288 : int
        var_7_28D : int
        var_8_29C : \u8413\uc4d2\u839e\u965f\u0800
        var_9_2A8 : \u7bad\u71ae\ua61f\ub102\u8413
        var_8_2B6 : CommandSyntaxException
        
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
        var_2_AE = and:int(and:int(ldc:int(-2025581), ldc:int(-570989195)), ldc:int(-70654723))
        var_4_74 = invokevirtual:String(String::substring, invokevirtual:String(StringReader::getString, p0:StringReader), invokevirtual:int(StringReader::getCursor, p0:StringReader), invokevirtual:int(StringReader::getTotalLength, p0:StringReader))
        
        loop {
            if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(32768)), ldc:int(0))) {
                var_2_AE = and:int(var_2_AE:int, ldc:int(369758526))
                goto(Label_0248)
            }
            
            if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0190)
            }
            
            if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_AE = and:int(var_2_AE:int, ldc:int(-34087629))
                
                if (p1:boolean) {
                    var_5_13D = invokestatic:ArrayList(Lists::newArrayList)
                    var_2_164 = and:int(var_2_AE:int, ldc:int(-69472995))
                    var_6_148 = invokevirtual:int(StringReader::getCursor, p0:StringReader)
                    
                    loop {
                        Label_0330:
                        
                        if (cmpne:boolean(and:int(var_2_164:int, ldc:int(16384)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(1138565491))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_164:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(-2128627596))
                            goto(Label_0535)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_164:int, ldc:int(2048)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(-1227539493))
                            goto(Label_0451)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(524288)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(-67549865))
                            
                            if (invokevirtual:boolean(StringReader::canRead, p0:StringReader)) {
                                if (cmpeq:boolean(invokevirtual:char(StringReader::peek, p0:StringReader), ldc:char(64))) {
                                    goto(Label_0535)
                                }
                                
                                goto(Label_0991)
                            }
                        }
                        
                        Label_0394:
                        
                        if (cmpne:boolean(and:int(var_2_164:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(1)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(822453325))
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(-1161844978))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_164:int, ldc:int(8192)), ldc:int(0))) {
                                var_2_164 = and:int(var_2_164:int, ldc:int(293443611))
                                loopcontinue()
                            }
                            
                            var_2_164 = and:int(var_2_164:int, ldc:int(-622889289))
                        }
                        
                        Label_0451:
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(8192)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(134217728)), ldc:int(0))) {
                                var_2_164 = and:int(var_2_164:int, ldc:int(-1373989092))
                                goto(Label_0394)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(8192)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            loopcontinue()
                        }
                        
                        Label_0535:
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(1145750393))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(268435456)), ldc:int(0))) {
                                var_2_164 = and:int(var_2_164:int, ldc:int(384313312))
                                goto(Label_0451)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_164:int, ldc:int(2048)), ldc:int(0))) {
                                var_2_164 = and:int(var_2_164:int, ldc:int(-194593869))
                                goto(Label_0394)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_164:int, ldc:int(131072)), ldc:int(0))) {
                                var_2_164 = and:int(var_2_164:int, ldc:int(-963999375))
                                loopcontinue()
                            }
                            
                            var_2_164 = and:int(var_2_164:int, ldc:int(-623950315))
                        }
                        
                        Label_0600:
                        
                        if (cmpne:boolean(and:int(var_2_164:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(-1782885257))
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(4194304)), ldc:int(0))) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(1627127190))
                            goto(Label_0451)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(64)), ldc:int(0))) {
                            var_2_288 = and:int(var_2_164:int, ldc:int(-87587595))
                            var_7_28D = invokevirtual:int(StringReader::getCursor, p0:StringReader)
                            
                            try {
                                var_2_288 = and:int(var_2_288:int, ldc:int(-69525827))
                                var_8_29C = initobject:\u8413\uc4d2\u839e\u965f\u0800(\u8413\uc4d2\u839e\u965f\u0800::<init>, p0:StringReader)
                                var_2_288 = and:int(var_2_288:int, ldc:int(-85643941))
                                var_9_2A8 = invokevirtual:\u7bad\u71ae\ua61f\ub102\u8413(\u8413\uc4d2\u839e\u965f\u0800::\ud171\uceb8\u71ae\uae87\u74b1\ubb2b, var_8_29C:\u8413\uc4d2\u839e\u965f\u0800)
                                var_2_288 = and:int(var_2_288:int, ldc:int(-83925797))
                                goto(Label_1002)
                            }
                            catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_8_2B6) {
                                loop {
                                    if (cmpeq:boolean(and:int(var_2_288:int, ldc:int(1024)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(2110282137))
                                        goto(Label_0943)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_288:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_0873)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(32768)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(1099155396))
                                        goto(Label_0824)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(8192)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(-1138355487))
                                    }
                                    else {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(-572660359))
                                        
                                        if (cmpeq:boolean(invokevirtual:CommandExceptionType[expected:Object](CommandSyntaxException::getType, var_8_2B6:CommandSyntaxException), getstatic:SimpleCommandExceptionType[expected:Object](\u8413\uc4d2\u839e\u965f\u0800::\ubcb0\u0800\ua6bd\u4492\uc246\ub70c))) {
                                            goto(Label_0929)
                                        }
                                    }
                                    
                                    Label_0764:
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(524288)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(-1744478466))
                                        goto(Label_0943)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_288:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_0873)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(134217728)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_2_288:int, ldc:int(64)), ldc:int(0))) {
                                            var_2_288 = and:int(var_2_288:int, ldc:int(-1722378166))
                                            loopcontinue()
                                        }
                                        
                                        var_2_288 = and:int(var_2_288:int, ldc:int(-606267721))
                                        
                                        if (cmpeq:boolean(invokevirtual:CommandExceptionType[expected:Object](CommandSyntaxException::getType, var_8_2B6:CommandSyntaxException), getstatic:DynamicCommandExceptionType[expected:Object](\u8413\uc4d2\u839e\u965f\u0800::\u97e6\ua6bd\u97e6\u071d\u71f1\u76bc))) {
                                            goto(Label_0929)
                                        }
                                    }
                                    
                                    Label_0824:
                                    
                                    if (cmpeq:boolean(and:int(var_2_288:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0943)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_288:int, ldc:int(32768)), ldc:int(0))) {
                                        if (cmpeq:boolean(and:int(var_2_288:int, ldc:int(1073741824)), ldc:int(0))) {
                                            var_2_288 = and:int(var_2_288:int, ldc:int(-2021157677))
                                            goto(Label_0764)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_288:int, ldc:int(64)), ldc:int(0))) {
                                            var_2_288 = and:int(var_2_288:int, ldc:int(-1142232860))
                                            loopcontinue()
                                        }
                                        
                                        var_2_288 = and:int(var_2_288:int, ldc:int(-606516161))
                                    }
                                    
                                    Label_0873:
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(262144)), ldc:int(0))) {
                                        goto(Label_0943)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(16384)), ldc:int(0))) {
                                        goto(Label_0824)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(8192)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(196630833))
                                        goto(Label_0764)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(2048)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(-461296317))
                                        loopcontinue()
                                    }
                                    
                                    athrow(var_8_2B6:CommandSyntaxException)
                                    Label_0929:
                                    invokevirtual:void(StringReader::setCursor, p0:StringReader, add:int(var_7_28D:int, xor:int(ldc:int(18468), ldc:int(18469))))
                                    Label_0943:
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(2048)), ldc:int(0))) {
                                        var_2_288 = and:int(var_2_288:int, ldc:int(663075590))
                                        goto(Label_0873)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(16384)), ldc:int(0))) {
                                        goto(Label_0824)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(262144)), ldc:int(0))) {
                                        goto(Label_0764)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_288:int, ldc:int(1)), ldc:int(0))) {
                                        var_2_164 = and:int(var_2_288:int, ldc:int(-640473259))
                                        loopcontinue(Label_0330)
                                    }
                                }
                            }
                            
                            goto(Label_0991)
                            Label_1002:
                            invokeinterface:boolean(List<\uc3e3\u5654\u9937\u527a\u7bad>::add, var_5_13D:ArrayList<\uc3e3\u5654\u9937\u527a\u7bad>[expected:List<\uc3e3\u5654\u9937\u527a\u7bad>], initobject:\uc3e3\u5654\u9937\u527a\u7bad(\uc3e3\u5654\u9937\u527a\u7bad::<init>, sub:int(var_7_28D:int, var_6_148:int), sub:int(invokevirtual:int(StringReader::getCursor, p0:StringReader), var_6_148:int), var_9_2A8:\u7bad\u71ae\ua61f\ub102\u8413))
                            var_2_164 = and:int(var_2_288:int, ldc:int(-54433987))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                        Label_0991:
                        invokevirtual:void(StringReader::skip, p0:StringReader)
                    }
                    
                    return:\u3a62\u9a18\u5db4\u6b5f\u51b2(initobject:\u3a62\u9a18\u5db4\u6b5f\u51b2(\u3a62\u9a18\u5db4\u6b5f\u51b2::<init>, var_4_74:String, checkcast:\uc3e3\u5654\u9937\u527a\u7bad[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc3e3\u5654\u9937\u527a\u7bad[].class, invokeinterface:\uc3e3\u5654\u9937\u527a\u7bad[](List<E>::toArray, var_5_13D:ArrayList<\uc3e3\u5654\u9937\u527a\u7bad>[expected:List<\uc3e3\u5654\u9937\u527a\u7bad>], newarray:\uc3e3\u5654\u9937\u527a\u7bad[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc3e3\u5654\u9937\u527a\u7bad.class, invokeinterface:int(List<E>::size, var_5_13D:ArrayList<\uc3e3\u5654\u9937\u527a\u7bad>))))))
                }
            }
            
            Label_0156:
            
            if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0248)
            }
            
            if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_AE = and:int(var_2_AE:int, ldc:int(-1070827089))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(134217728)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_AE = and:int(var_2_AE:int, ldc:int(-85592621))
            }
            
            Label_0190:
            
            if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(524288)), ldc:int(0))) {
                var_2_AE = and:int(var_2_AE:int, ldc:int(928242907))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_AE = and:int(var_2_AE:int, ldc:int(-151726608))
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_AE = and:int(var_2_AE:int, ldc:int(-1959301370))
                    loopcontinue()
                }
                
                var_2_AE = and:int(var_2_AE:int, ldc:int(-102118381))
                invokevirtual:void(StringReader::setCursor, p0:StringReader, invokevirtual:int(StringReader::getTotalLength, p0:StringReader))
            }
            
            Label_0248:
            
            if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_AE = and:int(var_2_AE:int, ldc:int(219122921))
                goto(Label_0190)
            }
            
            if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0156)
            }
            
            if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(16)), ldc:int(0))) {
                return:\u3a62\u9a18\u5db4\u6b5f\u51b2(initobject:\u3a62\u9a18\u5db4\u6b5f\u51b2(\u3a62\u9a18\u5db4\u6b5f\u51b2::<init>, var_4_74:String, newarray:\uc3e3\u5654\u9937\u527a\u7bad[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc3e3\u5654\u9937\u527a\u7bad.class, and:int(ldc:int(-3116), ldc:int(3115)))))
            }
            
            var_2_AE = and:int(var_2_AE:int, ldc:int(-1412295807))
        }
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
    
    public void \ucb79\u5fe1\ub102\u494c\u4179\u6cfe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_674 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_67F : int
        
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
        var_3_674 = and:int(ldc:int(452904625), ldc:int(464975717))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u9a18\u5db4\u6b5f\u51b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(1594438445))
        }
        else {
            var_3_674 = and:int(var_3_674:int, ldc:int(2142697445))
            var_5_8A = and:int(ldc:int(-20815), ldc:int(20750))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22010), ldc:int(17721)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_674:int, ldc:int(-537473171))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(4117), ldc:int(3107)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(4230), ldc:int(4231)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_674 = and:int(var_3_D9:int, ldc:int(2079774295))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-32736), ldc:int(-32735)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(473087888))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2307213))
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(684831448))
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-32896076))
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-182331812))
                    }
                    else {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1056892915))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0415:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1350156232))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1830344619))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1285879426))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(987313852))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1391785632))
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-463641568))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(989263585))
                            var_11_EA = and:int(ldc:int(19536), ldc:int(-23634))
                            goto(Label_1505)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2009469926))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-42118115))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1052564031))
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1641725791))
                            goto(Label_0415)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-67187057))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0713:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(327795992))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1927940753))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-828157947))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1347180147))
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1185490870))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-350860854))
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-29892743))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0856:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1302583984))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2017231508))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1182681257))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1355901623))
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(913555886))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(2134888415))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(25893), ldc:int(4115))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0985:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1203049605))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(2066598419))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0415)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-29370501))
                        var_11_EA = and:int(ldc:int(-12983), ldc:int(12950))
                    }
                    
                    Label_1123:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(280853479))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0985)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(64)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1536423713))
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1521921543))
                            goto(Label_0713)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1092783359))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1213828466))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(1610088253))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1365)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(956725610))
                            goto(Label_1123)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0985)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1733928840))
                            goto(Label_0856)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(989259607))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                            goto(Label_1505)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1365:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1796419688))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(659693732))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(64)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2030794128))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1136380042))
                        goto(Label_0713)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(64)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1080010555))
                        loopcontinue()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-29437985))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1505:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1516:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(571757932))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1906145285))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1615897645))
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-946910366))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1830838756))
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1917095033))
                        goto(Label_0415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2117584457))
                        var_17_67F = add:int(var_16_118:int, xor:int(ldc:int(-29952), ldc:int(-29951)))
                        looporswitchbreak()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-807294930))
                }
                
                var_3_674 = and:int(var_3_674:int, ldc:int(-1166096777))
                
                if (cmple:boolean(var_5_8A = var_17_67F:int, sub:int(var_6_91:int, xor:int(ldc:int(1608), ldc:int(1609))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
