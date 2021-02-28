public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u9a18\u99f7\ua068\u64ab\u4d85 {
    public void \u9a18\u99f7\ua068\u64ab\u4d85() {
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
            invokespecial:\u5f50\u7bad\ubcb0\u600f\u4975(\u5f50\u7bad\ubcb0\u600f\u4975::<init>, this:\u9a18\u99f7\ua068\u64ab\u4d85)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ud4fe\ucef1\u647c\uc2bd\u40a9() {
        var_1_154 : int
        var_5_CF : Runtime
        stack_108_0 : Runtime [generated]
        expr_DD : String[] [generated]
        var_6_10B : Process
        var_7_114 : IOException
        var_3_129 : OutputStream
        var_4_12F : InputStream
        var_7_15C : IOException
        var_7_181 : BufferedReader
        var_9_196 : String
        var_8_19E : String
        var_10_1D7 : IOException
        var_10_1E7 : IOException
        var_12_205 : IOException
        
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
        var_1_154 = and:int(ldc:int(-1261602685), ldc:int(-152636445))
        
        loop {
            if (cmpne:boolean(and:int(var_1_154:int, ldc:int(16)), ldc:int(0))) {
                var_1_154 = and:int(var_1_154:int, ldc:int(90311304))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_1_154:int, ldc:int(8)), ldc:int(0))) {
                var_1_154 = and:int(var_1_154:int, ldc:int(1020480380))
            }
            else {
                var_1_154 = and:int(var_1_154:int, ldc:int(-52628285))
                
                if (cmpeq:boolean(getstatic:String(\u9a18\u99f7\ua068\u64ab\u4d85::\u3a62\uc2bd\u64f2\u5db4\u3dd3), aconstnull:String())) {
                    var_5_CF = invokestatic:Runtime(Runtime::getRuntime)
                    
                    try {
                        stack_108_0 = var_5_CF:Runtime
                        expr_DD = newarray:String[](java.lang.String.class, and:int(ldc:int(18), ldc:int(25538)))
                        storeelement:String(expr_DD:String[], and:int(ldc:int(-16966), ldc:int(16965)), loadelement:String(getstatic:String[](\u9a18\u99f7\ua068\u64ab\u4d85::\u67e9\u99f7\uf94d\uc7fe\u99f7), and:int(ldc:int(21013), ldc:int(-21014))))
                        storeelement:String(expr_DD:String[], and:int(ldc:int(161), ldc:int(20507)), loadelement:String(getstatic:String[](\u9a18\u99f7\ua068\u64ab\u4d85::\u67e9\u99f7\uf94d\uc7fe\u99f7), and:int(ldc:int(5153), ldc:int(16781))))
                        var_6_10B = invokevirtual:Process(Runtime::exec, stack_108_0:Runtime, expr_DD:String[])
                    }
                    catch (java.io.IOException var_7_114) {
                        athrow(initobject:RuntimeException(RuntimeException::<init>, var_7_114:IOException[expected:Throwable]))
                    }
                    
                    var_3_129 = invokevirtual:OutputStream(Process::getOutputStream, var_6_10B:Process)
                    var_4_12F = invokevirtual:InputStream(Process::getInputStream, var_6_10B:Process)
                    
                    try {
                        do {
                            if (cmpeq:boolean(and:int(var_1_154:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_154 = and:int(var_1_154:int, ldc:int(-894656003))
                            }
                            else {
                                var_1_154 = and:int(var_1_154:int, ldc:int(-186747977))
                                invokevirtual:void(OutputStream::close, var_3_129:OutputStream)
                            }
                        } while (cmpeq:boolean(and:int(var_1_154:int, ldc:int(4194304)), ldc:int(0)))
                        
                        var_1_154 = and:int(var_1_154:int, ldc:int(1993143467))
                    }
                    catch (java.io.IOException var_7_15C) {
                        athrow(initobject:RuntimeException(RuntimeException::<init>, var_7_15C:IOException[expected:Throwable]))
                    }
                    
                    var_7_181 = initobject:BufferedReader(BufferedReader::<init>, initobject:InputStreamReader[expected:Reader](InputStreamReader::<init>, var_4_12F:InputStream))
                    var_9_196 = loadelement:String(getstatic:String[](\u9a18\u99f7\ua068\u64ab\u4d85::\u67e9\u99f7\uf94d\uc7fe\u99f7), xor:int(ldc:int(-22528), ldc:int(-22526)))
                    
                    try {
                        while (cmpne:boolean(var_8_19E = invokevirtual:String(BufferedReader::readLine, var_7_181:BufferedReader), aconstnull:String())) {
                            if (invokevirtual:boolean(String::contains, var_8_19E:String, var_9_196:String[expected:CharSequence])) {
                                putstatic:String(\u9a18\u99f7\ua068\u64ab\u4d85::\u3a62\uc2bd\u64f2\u5db4\u3dd3, invokevirtual:String(String::trim, loadelement:String(invokevirtual:String[](String::split, var_8_19E:String, loadelement:String(getstatic:String[](\u9a18\u99f7\ua068\u64ab\u4d85::\u67e9\u99f7\uf94d\uc7fe\u99f7), and:int(ldc:int(24707), ldc:int(3395)))), xor:int(ldc:int(4104), ldc:int(4105)))))
                                looporswitchbreak()
                            }
                        }
                        
                        try {
                            invokevirtual:void(InputStream::close, var_4_12F:InputStream)
                        }
                        catch (java.io.IOException var_10_1D7) {
                            athrow(initobject:RuntimeException(RuntimeException::<init>, var_10_1D7:IOException[expected:Throwable]))
                        }
                    }
                    catch (java.io.IOException var_10_1E7) {
                        athrow(initobject:RuntimeException(RuntimeException::<init>, var_10_1E7:IOException[expected:Throwable]))
                    }
                    finally {
                        try {
                            invokevirtual:void(InputStream::close, var_4_12F:InputStream)
                        }
                        catch (java.io.IOException var_12_205) {
                            athrow(initobject:RuntimeException(RuntimeException::<init>, var_12_205:IOException[expected:Throwable]))
                        }
                    }
                    
                    if (cmpeq:boolean(getstatic:String(\u9a18\u99f7\ua068\u64ab\u4d85::\u3a62\uc2bd\u64f2\u5db4\u3dd3), aconstnull:String())) {
                        athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\u9a18\u99f7\ua068\u64ab\u4d85::\u67e9\u99f7\uf94d\uc7fe\u99f7), xor:int(ldc:int(8898), ldc:int(8902)))))
                    }
                    
                    return:String(getstatic:String(\u9a18\u99f7\ua068\u64ab\u4d85::\u3a62\uc2bd\u64f2\u5db4\u3dd3))
                }
            }
            
            Label_0137:
            
            if (cmpne:boolean(and:int(var_1_154:int, ldc:int(64)), ldc:int(0))) {
                var_1_154 = and:int(var_1_154:int, ldc:int(1443084311))
            }
            else {
                if (cmpne:boolean(and:int(var_1_154:int, ldc:int(512)), ldc:int(0))) {
                    var_1_154 = and:int(var_1_154:int, ldc:int(746495560))
                    loopcontinue()
                }
                
                var_1_154 = and:int(var_1_154:int, ldc:int(-1261111369))
            }
            
            Label_0172:
            
            if (cmpne:boolean(and:int(var_1_154:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0137)
            }
            
            if (cmpeq:boolean(and:int(var_1_154:int, ldc:int(2097152)), ldc:int(0))) {
                return:String(getstatic:String(\u9a18\u99f7\ua068\u64ab\u4d85::\u3a62\uc2bd\u64f2\u5db4\u3dd3))
            }
        }
    }
    
    static {
        var_0_7B : int
        expr_6B : int [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1AD_0 : byte[] [generated]
        stack_224_0 : byte[] [generated]
        stack_27A_0 : byte[] [generated]
        var_4_190 : int
        var_3_195 : byte[]
        var_5_196 : int
        var_0_1A3 : int
        expr_1AD : byte [generated]
        stack_1E9_2 : byte [generated]
        stack_1C8_0 : byte [generated]
        expr_227 : byte [generated]
        expr_97 : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_269 : byte[]
        var_5_26A : int
        var_3_EA : String
        stack_189_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
        var_0_7B = and:int(ldc:int(-326698200), ldc:int(2135406200))
        expr_6B = arraylength:int(stack_95_0 = stack_97_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_1AD_0 = stack_224_0 = stack_27A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ufb4Y41Y3BI2gQyo/u72Augq+uDGOgDE8irB+voGMKd71gII5FUIBLPGtsKetn9CbkxYUgTYBPoKwDQo+Lj+OJwg0uuKAvb4MlWxJjgI/ijB")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_190 = expr_6B:int
        var_3_195 = newarray:byte[](byte.class, expr_6B:int)
        var_5_196 = expr_6B:int
        Label_0408:
        
        while (cmpne:boolean(and:int(var_0_7B:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1A3 = and:int(var_0_7B:int, ldc:int(-39929340))
            var_5_196 = add:int(var_5_196:int, ldc:int(-1))
            expr_1AD = stack_1E9_2 = loadelement(stack_1AD_0, var_5_196)
            
            if (cmplt:boolean(add:int(add:int(var_5_196:int, ldc:int(6)), neg:int(var_4_190:int)), ldc:int(0))) {
                stack_1E9_2 = stack_1C8_0 = add:byte(expr_1AD:byte, loadelement:byte(var_3_195:byte[], add:int(var_5_196:int, ldc:int(6))))
                goto(Label_0472)
            }
            
            Label_0442:
            
            if (cmpeq:boolean(and:int(var_0_1A3:int, ldc:int(4)), ldc:int(0))) {
                var_0_1A3 = and:int(var_0_1A3:int, ldc:int(-541082033))
                stack_1E9_2 = stack_1C8_0 = add:byte(expr_1AD:byte, ldc:byte(6))
            }
            
            Label_0472:
            
            if (cmpeq:boolean(and:int(var_0_1A3:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0442)
            }
            
            var_0_7B = and:int(var_0_1A3:int, ldc:int(-316213414))
            storeelement:byte(var_3_195:byte[], var_5_196:int, stack_1E9_2:byte)
            
            if (cmpne:boolean(var_5_196:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_1AD_0 = stack_224_0 = stack_27A_0 = var_3_195:byte[]
            goto(Label_0112)
        }
        
        Label_0527:
        
        while (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(4)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1858599677))
            var_5_196 = add:int(var_5_196:int, ldc:int(-1))
            expr_227 = xor:byte(loadelement:byte(stack_224_0:byte[], var_5_196:int), ldc:byte(86))
            storeelement:byte(var_3_195:byte[], var_5_196:int, add:int(or:int(and:int(shl:int(expr_227:byte, xor:int(ldc:int(-32510), ldc:int(-32506))), ldc:int(-16)), and:int(shr:int(expr_227:byte[expected:int], and:int(ldc:int(17676), ldc:int(132))), ldc:int(15))), ldc:int(39)))
            
            if (cmpne:boolean(var_5_196:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_1AD_0 = stack_224_0 = stack_27A_0 = var_3_195:byte[]
            goto(Label_0156)
        }
        
        goto(Label_0408)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(262144)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(929496550))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1752815090))
        }
        else {
            var_0_7B = and:int(var_0_7B:int, ldc:int(2131672618))
            expr_97 = arraylength:int(stack_97_0:byte[])
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_4_190 = expr_97:int
                var_3_195 = newarray:byte[](byte.class, expr_97:int)
                var_5_196 = expr_97:int
                goto(Label_0527)
            }
        }
        
        Label_0156:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_7B:int, ldc:int(-28396876))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_269 = newarray:byte[](byte.class, expr_B5:int)
                var_5_26A = expr_B5:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(1312275369))
                    var_5_26A = add:int(var_5_26A:int, ldc:int(-1))
                    storeelement:byte(var_3_269:byte[], var_5_26A:int, add:int(shl:int(loadelement:byte(stack_27A_0:byte[], var_5_26A:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_26A:int, xor:int(ldc:int(16448), ldc:int(16449)))), ldc:int(5)), and:int(ldc:int(1543), ldc:int(8279)))))
                    
                    if (cmpne:boolean(var_5_26A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_1AD_0 = stack_224_0 = stack_27A_0 = var_3_269:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(1)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(-1605877066))
            goto(Label_0156)
        }
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1831945432))
            goto(Label_0112)
        }
        
        var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_189_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(138), ldc:int(143)))
        expr_FC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1157), ldc:int(1152)))
        storeelement:String(expr_FC:String[], and:int(ldc:int(-10801), ldc:int(10800)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(26123), ldc:int(-26124)), and:int(ldc:int(25), ldc:int(4665))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(8744), ldc:int(8747)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(4108), ldc:int(4117)), xor:int(ldc:int(1095), ldc:int(1117))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(7), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(542), ldc:int(4122)), xor:int(ldc:int(-32479), ldc:int(-32496))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(9217), ldc:int(17165)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(16403), ldc:int(16418)), xor:int(ldc:int(4), ldc:int(71))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(2050), ldc:int(231)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(18636), ldc:int(18575)), and:int(ldc:int(12881), ldc:int(346))))
        putstatic:String[](\u9a18\u99f7\ua068\u64ab\u4d85::\u67e9\u99f7\uf94d\uc7fe\u99f7, expr_FC:String[])
    }
    
    public void \u92ee\ub18d\u4e72\u760c\u600f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_685 : int
        
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
        var_3_67A = and:int(ldc:int(-2145939355), ldc:int(511113325))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9a18\u99f7\ua068\u64ab\u4d85[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(-238112137))
            var_5_7D = and:int(ldc:int(17956), ldc:int(-18109))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22001), ldc:int(21872)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_67A:int, ldc:int(-1565018515))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(129), ldc:int(128)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(27), ldc:int(417)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_67A = and:int(var_3_CA:int, ldc:int(1330634239))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-28512), ldc:int(-28511)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1553539110))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(571812686))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1557159756))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-263252426))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1119264984))
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-349762494))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1842344055))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1685471721))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(2042497966))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2049413979))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1979885900))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1066513))
                        var_11_DB = and:int(ldc:int(19984), ldc:int(-28177))
                        goto(Label_1524)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1266376030))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1405278113))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-565406415))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(977169987))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(302451454))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(430937703))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0674:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-80987166))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-192807396))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(2115504307))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2119803721))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1811505630))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-519426810))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1254528431))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1684615206))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(619623029))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1185907797))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(232025592))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(608353175))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1541490976))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1859573357))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(3), ldc:int(2))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0951:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1703512727))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(318055096))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-992385657))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-533004945))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1107008337))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(54958709))
                        var_11_DB = and:int(ldc:int(2769), ldc:int(-3800))
                    }
                    
                    Label_1111:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-40784292))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1862368097))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-251439464))
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(245436186))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-45016640))
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-6176382))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-718968875))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1191113463))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1394)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1111)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-160227799))
                            goto(Label_0951)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1902999796))
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(58449610))
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-2062835837))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1906806148))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1936192623))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1814166319))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1209604115))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1351686504))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1132880567))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67A = and:int(var_3_67A:int, ldc:int(252162423))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_685 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1965320818))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-796975572))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1806065004))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(858620350))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1287719005))
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-219171916))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-197665555))
                        var_17_685 = add:int(var_16_109:int, and:int(ldc:int(16429), ldc:int(8449)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67A = and:int(var_3_67A:int, ldc:int(-297877889))
                
                if (cmple:boolean(var_5_7D = var_17_685:int, sub:int(var_6_84:int, and:int(ldc:int(4193), ldc:int(16385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
